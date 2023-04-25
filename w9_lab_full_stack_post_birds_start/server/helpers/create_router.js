const express = require('express');
const { ObjectId } = require('mongodb');

const createRouter = function (collection) {

  const router = express.Router();

  router.get('/', (req, res) => {
    collection
      .find()
      .toArray()
      .then((docs) => res.json(docs))
      .catch((err) => {
        console.error(err);
        res.status(500);
        res.json({ status: 500, error: err });
      });
  });

  router.get('/:id', (req, res) => {
    const id = req.params.id;
    collection
      .findOne({ _id: new ObjectId(id) })
      .then((doc) => res.json(doc))
      .catch((err) => {
        console.error(err);
        res.status(500);
        res.json({ status: 500, error: err });
      });
  });

  router.post('/', (req, res) => {

    console.log(req.method);
    console.log(req.url);
    console.log(req.body);

    const newData = req.body;
    console.log("Received new data: ", newData);

    collection
      .insertOne(newData)
      .then(result => {
        console.log("Received new data: ", newData);
        res.json({_id: result.insertedId})
      })
      .catch(err => {
        console.errror(err)
        res.status(500)
        res.json({ status: 500, error: err })
      })
  })
 
  router.delete('/:id', (req, res) => {
    const id = req.params.id;
    collection
    .deleteOne({ _id: new ObjectId(id) })
    .then(result => res.json(result))
    .catch(err => {
      console.error(err)
      res.status(500)
      res.json({ status: 500, error: err })
    })
  })

  return router;
};

module.exports = createRouter;

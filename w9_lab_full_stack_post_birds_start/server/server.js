
// import express
const express = require('express');

// run app through/with express
const app = express();

// import cors middleware library and allow cross origin requests on express app
const cors = require('cors');
app.use(cors());

// allow express to parse incoming json payloads in request bodies
app.use(express.json());


// import MongoClient class from the MongoDb driver
const MongoClient = require('mongodb').MongoClient;

// import createRouter from helpers
const createRouter = require('./helpers/create_router.js');





// These lines connect to a MongoDB database running on the local machine at the default port 27017,
// create a reference to the "sightings" collection in a database named "birds", 
// and use the custom router helper function to create RESTful routes for CRUD operations on the "sightings" collection at the endpoint "/api/sightings".
MongoClient.connect('mongodb://127.0.0.1:27017', { useUnifiedTopology: true })
  .then((client) => {
    const db = client.db('birds');
    const sightingsCollection = db.collection('sightings');
    const sightingsRouter = createRouter(sightingsCollection);
    app.use('/api/sightings', sightingsRouter);
  })
  .catch(console.err);


// This line starts the Express application listening on port 9000 
// and logs a message to the console indicating the port number.
app.listen(9000, function () {
  console.log(`Listening on port ${ this.address().port }`);
});

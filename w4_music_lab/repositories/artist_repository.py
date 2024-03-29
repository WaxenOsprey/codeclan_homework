import pdb
from db.run_sql import run_sql

from models.artist import Artist
from models.album import Album


def save(artist):
    sql = "INSERT INTO artists (name) VALUES (%s) RETURNING *"
    values = [artist.name]
    results = run_sql(sql, values)
    pdb.set_trace()
    id = results[0]['id']
    artist.id = id
    return artist

def delete_all():
    sql = "DELETE FROM artists"
    run_sql(sql)

def select(id):
    artist = None
    sql = "SELECT * FROM artists WHERE id = %s"
    values = [id]
    results = run_sql(sql, values)

     # checking if the list returned by `run_sql(sql, values)` is empty. Empty lists are 'false' 
    # Could alternativly have..
    # if len(results) > 0 
    if results:
        result = results[0]
        artist = Artist(result['name'], result['id'] )
    return artist


def select_all():
    artists = []
    sql = "SELECT * FROM artists"
    results = run_sql(sql)

    for row in results:
        artist = Artist(row['name'], row['id'] )
        artists.append(artist)
    return artists


# def delete(id):
#     sql = "DELETE  FROM users WHERE id = %s"
#     values = [id]
#     run_sql(sql, values)


# def update(user):
#     sql = "UPDATE users SET (first_name, last_name) = (%s, %s) WHERE id = %s"
#     values = [user.first_name, user.last_name, user.id]
#     run_sql(sql, values)
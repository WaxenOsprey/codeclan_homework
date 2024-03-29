from db.run_sql import run_sql
from models.album import Album
from models.artist import Artist

import repositories.artist_repository as artist_repository


#save(album)
def save(album):
    sql = "INSERT INTO album (title, genre, artist) VALUES (%s, %s, %s) RETURNING *"
    values = [album.title, album.genre, album.artist]
    results = run_sql(sql, values)
    id = results[0]['id']
    album.id = id
    return album


#delete_all
def delete_all():
        sql = "DELETE FROM albums"
        run_sql(sql)


#select(id)
def select(id):
    album = None
    sql = "SELECT * FROM albums WHERE id = %s"
    values = [id]
    results = run_sql(sql, values)

    if len(results) > 0:
        selected_album = results[0]
        artist = artist_repository.select(selected_album['artist.id'])
        album = Album(
            selected_album['title'],
            selected_album['genre'],
            artist,
            selected_album['id']
        )
        return album


def select_all():
    #set up an empty list to be returned
    albums = []
    #create a string of SQL
    sql = "SELECT * FROM albums"
    #send my string to the run_sql function in run_sql.py
    results = run_sql(sql)

    #translate dictionaries into objects (right now a list of dicts)    
    for row in results:
        artist = artist_repository.select(row['artist_id'])
        #create a new album object 
        new_album = Album(
            row['title'],
            row['genre'],
            artist,
            row['id']
        )
        #append to the list
        albums.append(new_album)
    return albums




# #delete(id)
# def delete(id):
#       sql = "DELETE FROM Tasks WHERE id = %s"
#       values =[id]
#       run_sql(sql, values)


# #update(task)
# def update(task):
#       sql = """UPDATE tasks SET (description, user_id, duration, completed) 
#       = (%s, %s, %s, %s) WHERE id = %s"""
#       values = [task.description, task.user.id, task.duration, task.completed, task.id]
#       run_sql(sql, values)

# def tasks_for_user(user):
#     sql = "SELECT * FROM tasks WHERE user_id = %s"
#     values = [user.id]
#     results = run_sql(sql, values)

#     user_tasks = []

#     for row in results:
#         task = Task(row['description'], user, row['duration'], row['completed'], row['id'])
#         user_tasks.append(task)
#     return user_tasks

from models.artist import Artist
from models.album import Album
import repositories.artist_repository as artist_repository
import repositories.album_repository as album_repository


artist1 = Artist("The Smiths")
artist_repository.save(artist1)

artist2 = Artist("The Pixies")
artist_repository.save(artist2)

album1 = Album("The Queen is Dead", "Indie Rock", "The Smiths")
album_repository.save(album1)

album2 = Album("Come On Pilgrim", "Alternative Rock", "The Pixies")
album_repository.save(album2)

album_repository.delete_all()
artist_repository.delete_all()

#returns all albums as 
result = album_repository.select_all()

for album in result:
    print(album.id)
    print(album.title)



# task1.description = "Pick up Oat Milk"
# task_repository.update(task1)



# user1_tasks = task_repository.tasks_for_user(user1)
# print(f"{user1.first_name}'s tasks: ")
# for user in user1_tasks:
#     print(f"{task.description}")
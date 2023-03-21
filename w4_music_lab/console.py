from models.artist import Artist
from models.album import Album
import repositories.artist_repository as artist_repository
import repositories.album_repository as album_repository


artist1 = Artist("The Smiths")
artist_repository.save(artist1)

artist2 = Artist("The Pixies")
artist_repository.save(artist2)

# task1 = Task("Pick up milk", user1, 30)
# task_repository.save(task1)

# task2 = Task("Hoovering", user2, 120)
# task_repository.save(task2)

# task_repository.delete_all()
# user_repository.delete_all()

# task1.description = "Pick up Oat Milk"
# task_repository.update(task1)

# result = task_repository.select_all()

# for task in result:
#     print(task.id)
#     print(task.description)

# user1_tasks = task_repository.tasks_for_user(user1)
# print(f"{user1.first_name}'s tasks: ")
# for user in user1_tasks:
#     print(f"{task.description}")
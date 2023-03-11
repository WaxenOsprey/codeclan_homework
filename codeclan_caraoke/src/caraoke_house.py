from src.room import *
from src.guest import *

class CaraokeHouse:
    def __init__(self, name):
        self.name = name
        self.room_list = []
    
    def open_room(self, room_name):
        new_room = Room(room_name)
        self.room_list.append(new_room)
        for room in self.room_list:
            print(f"{room.name} is open")



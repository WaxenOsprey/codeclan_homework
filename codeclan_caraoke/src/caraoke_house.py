from src.room import *

class CaraokeHouse:
    def __init__(self, name):
        self.name = name
        self.room_list = []
    
    def open_room(self, room_name):
        new_room = Room("room_3")
        self.room_list.append(new_room)

    def check_in(self, guest):
        pass

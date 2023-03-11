from src.guest import *

class Room:
    def __init__(self, name):
        self.name = name
        self.songs_playlist = []
        self.guest_list = []
    
    def check_in(self, guest):
        self.guest_list.append(guest)
        for guest in self.guest_list:
            print(f"Checked in:  {guest.name} to {self.name}")
    
    def check_out(self, guest):
        self.guest_list.remove(guest)
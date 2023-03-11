from src.guest import *
from src.song import *

class Room:
    def __init__(self, name):
        self.name = name
        self.songs_playlist = []
        self.guest_list = []
    
    def check_in(self, guest):
        self.guest_list.append(guest)
        print()
        print()
        print(f"{guest.name} checked in to {self.name}")
    
    def check_out(self, guest):
        self.guest_list.remove(guest)
        print()
        print(f"{guest.name} checked out of {self.name}")
        print()

    def add_song(self, song):
        self.songs_playlist.append(song)
        print()
        print(f"'{song.title}' by {song.artist} has been added to {self.name}")
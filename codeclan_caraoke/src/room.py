from src.guest import *
from src.song import *

class Room:
    def __init__(self, name):
        self.name = name
        self.songs_playlist = []
        self.guest_list = []
        self.max_occupancy = 4
    
    def check_in(self, guest):
        if len(self.guest_list) < self.max_occupancy:
            self.guest_list.append(guest)
            print()
            print()
            print(f"{guest.name} checked into {self.name}")
        else: 
            print()
            print()
            print(f"Sorry {guest.name}, {self.name} is full. Please book a new room")
    
    def check_out(self, guest):
        self.guest_list.remove(guest)
        print()
        print()
        print(f"{guest.name} checked out of {self.name}")

    def add_song(self, song):
        self.songs_playlist.append(song)
        print()
        print()
        print(f'"{song.title}"" by {song.artist} has been added to {self.name}')
from src.guest import *
from src.song import *
from src.caraoke_house import *

class Room:
    def __init__(self, name):
        self.name = name
        self.songs_playlist = []
        self.guest_list = []
        self.max_occupancy = 4
        self.booking_fee_pp = 10.00

    
    def check_in(self, guest, house):
        if len(self.guest_list) < self.max_occupancy:
            self.guest_list.append(guest)
            self.collect_booking_fee(guest, house)
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

    def collect_booking_fee(self, guest, house):
        guest.wallet -= self.booking_fee_pp
        print()
        print(f"{guest.name} paid the booking fee of: {self.booking_fee_pp} their wallet total is now: {guest.wallet}")
        house.till += self.booking_fee_pp
        print()
        print(f"till total is now: {house.till}")


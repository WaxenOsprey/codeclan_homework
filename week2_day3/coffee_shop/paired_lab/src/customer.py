class Customer:
    def __init__(self, name, wallet_total):
        self.name = name
        self.wallet = wallet_total

    def pay_for_drink(self, drink):
        price = drink.price
        self.wallet -= price      
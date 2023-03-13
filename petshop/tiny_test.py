customers = [
{
    "name": "Alice",
    "pets": [],
    "cash": 1000
},
{
    "name": "Bob",
    "pets": [],
    "cash": 50
},
{
    "name": "Jack",
    "pets": [],
    "cash": 100
}
]

new_pet = {
"name": "Bors the Younger",
"pet_type": "cat",
"breed": "Cornish Rex",
"price": 100
}

cc_pet_shop = {
"pets": [
    {
        "name": "Sir Percy",
        "pet_type": "cat",
        "breed": "British Shorthair",
        "price": 500
    },
    {
        "name": "King Bagdemagus",
        "pet_type": "cat",
        "breed": "British Shorthair",
        "price": 500
    },
    {
        "name": "Sir Lancelot",
        "pet_type": "dog",
        "breed": "Pomsky",
        "price": 1000,
    },
    {
        "name": "Arthur",
        "pet_type": "dog",
        "breed": "Husky",
        "price": 900,
    },
    {
        "name": "Tristan",
        "pet_type": "cat",
        "breed": "Basset Hound",
        "price": 800,
    },
    {
        "name": "Merlin",
        "pet_type": "cat",
        "breed": "Egyptian Mau",
        "price": 1500,
    }
],
"admin": {
    "total_cash": 1000,
    "pets_sold": 0,
},
"name": "Camelot of Pets"
}

# WRITE YOUR FUNCTIONS HERE

def get_pet_shop_name(pet_shop):
    return pet_shop["name"]

def get_total_cash(pet_shop):
    return pet_shop["admin"]["total_cash"]

def add_or_remove_cash(pet_shop, cash_amount):
    pet_shop["admin"]["total_cash"] += cash_amount
    return pet_shop["admin"]["total_cash"] 

def get_pets_sold(pet_shop):
    return pet_shop["admin"]["pets_sold"]

def increase_pets_sold(pet_shop, increase_amount):
    pet_shop["admin"]["pets_sold"] += increase_amount
    return pet_shop["admin"]["pets_sold"]

def get_stock_count(pet_shop):
    return len(pet_shop["pets"])

def get_pets_by_breed(pet_shop, breed):
    list_of_pets = []
    for pet in pet_shop["pets"]:
        if pet["breed"] == breed:
            list_of_pets.append(pet)
    return list_of_pets

def find_pet_by_name(pet_shop, pet_name):
    for pet in pet_shop["pets"]:
        if pet["name"] == pet_name:
            return pet
    return None

#this could probably be done better with a method like index of instead of a counter var
def remove_pet_by_name(pet_shop, pet_name):
    #set counter for loop
    pet_counter = 0
    #loop through list of pets
    for pet in pet_shop["pets"]:
        #check for equality between given name and name at element
        if pet["name"] == pet_name:
            #remove element from list
            pet_shop["pets"].pop(pet_counter)
            return
        else:
            pet_counter += 1
    return

def add_pet_to_stock(pet_shop, pet_to_be_added):
    pet_shop["pets"].append(pet_to_be_added)
    return

def get_customer_cash(customer):
    return customer["cash"]

def remove_customer_cash(customer, cash):
    customer["cash"] -= cash
    return

def get_customer_pet_count(customer):
    pet_count = len(customer["pets"])
    return pet_count

def add_pet_to_customer(customer, pet_to_be_added):
    customer["pets"].append(pet_to_be_added)
    return

def customer_can_afford_pet(customer, new_pet):
    if customer["cash"] >= new_pet["price"]:
        return True
    return False

def sell_pet_to_customer(pet_shop, pet, customer):
    if pet == None:
        return
    can_afford = customer_can_afford_pet(customer, pet)
    if can_afford == False:
        return
    remove_customer_cash(customer, pet["price"])
    add_or_remove_cash(pet_shop, pet["price"])
    add_pet_to_customer(customer, pet)
    remove_pet_by_name(pet_shop, pet)
    increase_pets_sold(pet_shop, 1) 
    return 

customer = customers[0]
print(f"customer is {customer}")
pet = find_pet_by_name(cc_pet_shop,"Arthur")
print(f"pet is {pet}")
sell_pet_to_customer(cc_pet_shop, pet, customer)


    # remove money from customer,
    # add money to shop, 
    # remove pet from shop, 
    # add pet to customer
    # 

        
    #check if pet exists
        #if not return
    #check if customer funds sufficient
        #if not return
    



    




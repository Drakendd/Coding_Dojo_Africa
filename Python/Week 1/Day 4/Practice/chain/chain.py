class User:
    def __init__(self, first_name, last_name, email, age):
        self.first_name = first_name
        self.last_name = last_name
        self.email = email
        self.age = age
        self.is_rewards_member = False
        self.gold_card_points = 0

    def display_info(self):
        print(f"First Name: {self.first_name}")
        print(f"Last Name: {self.last_name}")
        print(f"Email: {self.email}")
        print(f"Age: {self.age}")
        print(f"Is Rewards Member: {self.is_rewards_member}")
        print(f"Gold Card Points: {self.gold_card_points}")
        return self

    def enroll(self):
        if self.is_rewards_member:
            print("User already a member.")
        else:
            self.is_rewards_member = True
            self.gold_card_points = 200
        return self  

    def spend_points(self, amount):
        if self.gold_card_points < amount:
            print("Insufficient points to spend.")
        else:
            self.gold_card_points -= amount
        return self  
user1 = User("yassin", "daira", "yassin.daira@gmail.com", 21).display_info().enroll().spend_points(50).display_info().enroll()
user2 = User("walid", "guetet", "walid.gutet@gmail.com", 33).enroll().spend_points(80).display_info()
user3 = User("hama", "Johnson", "hama.johnson@gmail.com", 99).spend_points(40)

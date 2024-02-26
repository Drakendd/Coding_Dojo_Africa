class BankAccount:
    def __init__(self, int_rate=0.0, balance=0):
        self.int_rate = int_rate
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount
        return self

    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
        else:
            print("Insufficient funds: Charging a $5 fee")
            self.balance -= 5
        return self

    def display_account_info(self):
        print(f"Balance: ${self.balance}")
        return self

    def yield_interest(self):
        if self.balance > 0:
            self.balance += self.balance * self.int_rate
        return self


class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.accounts = BankAccount(int_rate=0.02, balance=0)

    # def create_account(self, account_name, int_rate=0.02, balance=0):
    #     self.accounts[account_name] = BankAccount(int_rate=int_rate, balance=balance)
    #     return self

    def make_deposit(self,amount):
        self.accounts.deposit(amount)


    def make_withdrawal(self,amount):
        self.accounts.withdraw(amount)

    def display_user_balance(self):
        self.accounts.display_account_info()

# Example usage:
user1 = User("yassin daira","yassin.daira@example.com")
user1.make_deposit(100)
user1.make_withdrawal(50)
user1.display_user_balance()





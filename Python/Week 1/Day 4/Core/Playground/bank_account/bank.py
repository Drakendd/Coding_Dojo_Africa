class BankAccount:
    def __init__(self, int_rate=0.01, balance=0):
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
        print("Balance: $" + str(self.balance))
        return self

    def yield_interest(self):
        if self.balance > 0:
            self.balance += self.balance * self.int_rate
        return self

    def print_all_accounts_info(cls):
        for account in cls.all_accounts:
            print(f"Balance: ${account.balance}, Interest Rate: {account.int_rate}")

# 2 accounts to create
account1 = BankAccount()
account2 = BankAccount(int_rate=0.02, balance=100)

# Made a transactions for account1
account1.deposit(100).deposit(50).deposit(200).withdraw(75).yield_interest().display_account_info()

# Made a transactions for account2
account2.deposit(300).deposit(200).withdraw(50).withdraw(100).withdraw(75).withdraw(50).yield_interest().display_account_info()

# ninja bonus (Printing all accounts info) :)
BankAccount.print_all_accounts_info()

class Player:
    def __init__(self, player_dict):
        self.name = player_dict ["name"]
        self.age = player_dict ["age"]
        self.position = player_dict ["position"]
        self.team = player_dict ["team"]
    
    def __repr__(self):
        print(self.age)
        return f"player:{self.name}, {self.age} y/o, pos: {self.position}, team: {self.team}"
        # self.name, self.age, self.position, self.team 



kevin = {
        "name": "Kevin Durant", 
        "age":34, 
        "position": "small forward", 
        "team": "Brooklyn Nets"
}
jason = {
        "name": "Jason Tatum", 
        "age":24, 
        "position": "small forward", 
        "team": "Boston Celtics"
}
kyrie = {
        "name": "Kyrie Irving", 
        "age":32,
        "position": "Point Guard", 
        "team": "Brooklyn Nets"
}


player_kevin = Player(kevin)
print(player_kevin)

player_jason = Player(jason)
print(player_jason)

player_kyrie = Player(kyrie)
print(player_kyrie)


players = [   
    {
        "name": "Kevin Durant", 
        "age":34, 
        "position": "small forward", 
        "team": "Brooklyn Nets"
    },
    {
        "name": "Jason Tatum", 
        "age":24, 
        "position": "small forward", 
        "team": "Boston Celtics"
    },
    {
        "name": "Kyrie Irving", 
        "age":32,
        "position": "Point Guard", 
        "team": "Brooklyn Nets"
    },
    {
        "name": "Damian Lillard", 
        "age":33,
        "position": "Point Guard", 
        "team": "Portland Trailblazers"
    },
    {
        "name": "Joel Embiid", 
        "age":32,
        "position": "Power Foward", 
        "team": "Philidelphia 76ers"
    },
    {
        "name": "DeMar DeRozan",
        "age": 32,
        "position": "Shooting Guard",
        "team": "Chicago Bulls"
    },
    {
        "name": "",
        "age": 21,
        "position": "lw",
        "team": "kef"  
    },
    ]




#forloop over the list of dict
    #each time add that dict info
    # create new player
new_team = []
for player_dict in players:
    player = Player(player_dict)
    new_team.append(player)

print(new_team)


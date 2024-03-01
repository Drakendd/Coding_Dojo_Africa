from ..config.mysqlconnection import connectToMySQL

class Dojo:
    def __init__(self,data):
        self.id = data['id']
        self.name = data['name']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']

    @classmethod
    def getall(cls):
        query = "SELECT * FROM dojos;"
        results = connectToMySQL ('dojos_and_ninjas_db').query_db(query)
        place = []
        for row in results:
            place.append(cls(row))
        print(place)
        return place
    
    @classmethod
    def save(cls,data):
        query = "INSERT INTO dojos (name) VALUES(%(name)s);"
        results = connectToMySQL ('dojos_and_ninjas_db').query_db(query,data)
        return results
    
    @classmethod
    def get_by_id(cls,data):
        query = "SELECT * FROM dojos WHERE id=%(id)s;"
        results = connectToMySQL ('dojos_and_ninjas_db').query_db(query,data)
        return cls(results[0])
    
    @classmethod
    def edit(cls,data):
        query = "UPDATE dojos SET name = %(name)s WHERE id = %(id)s"
        results = connectToMySQL ('dojos_and_ninjas_db').query_db(query,data)
        return results
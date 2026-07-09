pb = ["laura", "Sarah", "Mek", "Jess", "Nikki", "Hailey", "Morgan", "Amber","Jake", "Aaron", "Frey"]
bfs = ["Jake", "Aaron", "Frey"]

#get a list of my friends sorted from \pb
#givien a list of friends and BFS
#return sorted list

def get_friends(girlfriends, boyfriends):
    friends = girlfriends.copy()
    for boyfriend in boyfriends:
        friends.remove(boyfriend)
        friends.sort()
    return friends

print("TEST", get_friends(pb, bfs))


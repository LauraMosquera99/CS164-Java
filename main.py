# Only to see if one wins.
def check_single(one, two):
    if (one == "Rock" or one == "rock") and (two == "scissors" or two == "Scissors"):
         return True
    if (one == "scissors" or one == "scissors") and (two == "Paper" or two == "paper"):
         return True
    if (one == "Paper" or one == "paper") and (two == "rock" or two == "Rock"):
         return True
    return False
#print("Test rock vs scissors: {}".format(check_single("rock", "scissors")))
#print(check_single("paper", "scissors"))

def get_choice():
    return input("Rock, paper, or scissors? ")

def rock_paper_scissors():
    player1 = get_choice()
    player2 = get_choice()
    end_game = False
    while end_game
        if check_single(player1, player2) :
            print("Player 1 wins")
            end_game = True
        elif check_single(player2, player1):
            print("Player 2 wins")
            end_game = True
        else: 
            print("No one wins, try again.")

rock_paper_scissors()


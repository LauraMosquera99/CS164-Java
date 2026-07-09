#def simple_cipher(msg, shift):
    index = 0
    encrypted = ""
    while index < len(msg):
        encrypted += chr(ord(msg[index]) + shift)
        index += 1
    return encrypted


#def my_cipher_game():
    msg = input("What message would you like to encrypt? ")
    shift = int(input("What is your key? "))
    action = input("Do you wish to encrypt or decrypt (e/d)? ")[0]
    if action == 'd':
        shift *= -1
    encrypted = simple_cipher(msg, shift)
    print("Your encrypted message is...\n{}".format(encrypted))
    my_cipher_game()

#redoing this cipher
def simple(msg, shift):
    encrypt = ''
    for char in msg:
        print(char)

simple_cipher("Test: ada", 2)
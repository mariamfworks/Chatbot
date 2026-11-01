import nltk
#import random
import string

from nltk.chat.util import Chat, reflections

# Download required NLTK data (first time only)
nltk.download('punkt')

# Define simple patterns and responses
pairs = [
    [r"hi|hello|hey", ["Hey there!", "Hello!", "Hi, how can I help you?"]],
    [r"what is your name\??", ["I'm a chatbot, but you can call me Bob."]],
    [r"how are you\??|wassup|sup|supp", ["I'm just code, but thanks for asking!", "Doing great in binary."]],
    [r"(.*) your favorite (.*)?", ["I don't have preferences, but I like your curiosity."]],
    [r"bye|exit|quit", ["Goodbye! Have a great day.", "See ya! Come back soon."]],
    [r"Who made you?",["Mariam F","A girl named 'Mariam Fatima'"]],
    [r"Who invented pizza?",["The Italians!"]],
    [r"Yes|yes|YES|yesss|yea|YEA|Yea|yeaa",["Woah cool!", "That's cool", "Chill", "chill chill"]],
    [r"(.*)", ["Tell me more.", "Why do you say that?", "Interesting... go on.","Really?"]]
]

chatbot = Chat(pairs, reflections)
print("Hi! I'm a simple chatbot. Type 'quit' to exit.")
chatbot.converse()

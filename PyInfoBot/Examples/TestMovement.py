from PyInfoFiles import Variables
import time


def test():
    print("Hello")
    while True:
        print(Variables.posX)
        time.sleep(5)
    print("poop")


def forward(blocks):
    while Variables.posX < Variables.posX + blocks:
        print("movement")

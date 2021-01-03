from PyInfoFiles import Variables
import time
import pyautogui


def test():
    if Variables.posX == "150":
        time.sleep(5)
        pyautogui.click()
        print(Variables.posX)

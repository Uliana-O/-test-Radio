package ru.netology;

public class Radio {
    public int currentChannelNum;
    public int minChannelNum = 0;
    public int maxChannelNum = 9;
    public int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 10;

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;

        }
    }

    public void setCurrentVolume() {
        if (currentVolume > maxVolume) {
            return;
        }
        {
            if (currentVolume < minVolume) {
                return;
            }

        }
    }

    public void maxChannelNum() {
        if (currentChannelNum < maxChannelNum) {
            currentChannelNum = currentChannelNum + 1;
        }
    }

    public void minChannelNum() {
        if (currentChannelNum > minChannelNum) {
            currentChannelNum = currentChannelNum - 1;
        }
    }
        public void setCurrentChannelNum() {
            if (currentChannelNum > maxChannelNum) {
                return;
            }
            {
                if (currentChannelNum < minChannelNum) {
                    return;
                }
            }
        }
    }







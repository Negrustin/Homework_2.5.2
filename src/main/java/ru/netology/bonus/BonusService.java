package ru.netology.bonus;

public class BonusService {
    public long calculateBonus(long amount, boolean registered){
int precent = registered ? 3 : 1;
long bonus = amount * precent / 100;
long limit = 500;
if (bonus > limit) {
    bonus = limit;
}
return bonus;
    }
}

var sum = 0
for i in 3...999{
    if (i%15==0) || (i%5==0) || (i%3==0) {
       sum += i
    }
}
print(sum)

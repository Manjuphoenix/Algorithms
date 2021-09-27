# The media company "GlobalAd" has received a
# batch of advertisements from different product
# brands. The batch of advertisements is a
# numeric value where each digit represents the
# number of advertisements the media company
# has received from different product brands.
# Since the company banners permit only even
# numbers of advertisements to be displayed, the
# media company needs to know the total
# number of advertisements it will be able to
# display from the given batch.
# Write an algorithm to calculate the total
# number of advertisements that will be
# displayed from the batch.
# Input
# The input consists of an integer batch,
# representing the batch of advertisements
# Output
# Print an integer representing the total number
# of advertisements that will be displayed by the
# media company
# Constraints
# 0 < batchs 109

Solution:
my_list = [int(x) for x in input().split()]
total = 0
for i in my_list:
    if i % 2 == 0:
        total = total+i
    else:
        continue
print(total)

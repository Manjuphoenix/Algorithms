#Enter the list of elements without space
    array = list(input("Enter the elements\n"))
#Enter the value of the element to be searched for
    num = input("ENter the number to be searched\n")
#Linear search:
    for i in range(len(array)):
        if(num==array[i]):
            print("Element found at position:", i)          #Prints the index of the element
            break       #If the element is not found, do nothing



#Node structure
class Node:
    def __init__(self,data) :
        self.data = data
        self.next = None

#Linkedlist structure
class LL:

    def __init__(self):
        self.head = None
        self.size = 0
    
    #function to insert first in the linked list
    def insertfirst(self,data):
        self.size = self.size + 1
        node = Node(data)
        
        #Logic for inserting into the list
        if self.head is None :
            self.head = node
        else :
            node.next = self.head
            self.head = node
    
    #function to insert last in the linkedlist
    def insertlast(self,data):
        self.size = self.size + 1
        node = Node(data)

        if self.head is None:
            self.head = node
        else:
            curr = self.head
            while curr.next is not None:
                curr = curr.next          
            curr.next = node
    
    

    def printlist(self):
        if self.head is None:
            print("List is empty")
        else:
           node = self.head
           while node is not None:
               print(node.data , "--> ",end="")
               node = node.next
    

linkedlist = LL()

linkedlist.insertfirst(6)
linkedlist.insertfirst(5)
linkedlist.insertfirst(4)
linkedlist.insertfirst(3)
linkedlist.insertfirst(2)
linkedlist.insertfirst(1)
linkedlist.insertlast(7)
linkedlist.printlist()
        
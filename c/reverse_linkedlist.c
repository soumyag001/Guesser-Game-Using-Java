

#include <stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
}*start;
void reverse(){
    struct Node *curr;
    struct Node *prev;
    struct Node *nex;
    if(start==NULL || start->next==NULL){
        printf("empty");
        
    }
    prev=NULL;
    curr=start;

    while(curr!=NULL)
    {
    nex=curr->next;
    nex->next=curr;
    prev=curr;
    curr=nex;
    }
    start=prev;
    
}
int main()
{
    struct Node *second;
    struct Node *third;
    start= (struct Node*)malloc(sizeof(struct Node));
    second= (struct Node*)malloc (sizeof(struct Node));
    third= (struct Node*)malloc (sizeof(struct Node));
    start->data=10;
    second->data=7;
    third->data=2;
    start->next=second;
    second->next=third;
    third->next=NULL;
    reverse();
    struct Node *ptr2;
    ptr2=start;
    while(ptr2!=NULL){
        printf("%d\n",ptr2->data);
        ptr2=ptr2->next;
    }
}




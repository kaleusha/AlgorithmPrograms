package com.bridgeit.DataStructure;

class Node<T>
{
	T data;
	Node<T> next;
	public Node(T data)
	{
		this.data = data;
		next = null;
	}
}
public class LinkedListStructure<T> 
{
	
	Node<T> root;
	Node<T> end;
	int size;
	
	
	public LinkedListStructure()
	{
		root = null;
		end = null;
		size = 0;
	}
	public boolean isEmpty()
	{
		if(root==null)
			return true;
		else
			return false;
	}

	public void add(T data) {
		Node<T> node = new Node<T>(data);
		if(this.isEmpty())
		{
			root=node;
			end=node;
			
		}
	}
	public void insert(int pos,T data)
	{
		int tempPos=0;
		Node<T> node = new Node<T>(data);
		Node<T> currNode,prevNode;
		currNode = prevNode = root;
		if(size < pos)
		{
			add(data);
		}
		else
		{
			while(pos != tempPos)
			{
				prevNode = currNode;
				currNode = currNode.next;
				tempPos++;
			}
			prevNode.next = node;
			node.next = currNode;
		}
	}
	public boolean search(T data)
	{
		Node<T> temp =root;
		boolean isPresent=false;
		while(temp != null)
		{
			if(temp.data.equals(data))
			{
				isPresent=true;
			}
			temp = temp.next;
		}
		return isPresent;
	}
	
	public int size()
	{
		Node<T> temp = root;
		int size=0;
		while(temp != null)
		{
			temp = temp.next;
			size++;
		}
		return size;
	}
	public void removeAt(int pos)
	{
		int tempPos=0;
		Node<T> prevNode=root;
		Node<T> currNode = root;
		if(pos == 0)
		{
			root = root.next;
		}
		else if(pos==(this.size()-1))
		{
			while(currNode.next != null)
			{
				prevNode = currNode;
				currNode = currNode.next;
			}
			prevNode.next = prevNode.next.next;
			end=prevNode;
		}
		else if(pos < this.size())
		{
			while(currNode.next != null)
			{
				if(pos == tempPos)
				{
					prevNode.next = prevNode.next.next;
					break;
				}
				prevNode = currNode;
				currNode = currNode.next;
				tempPos++;
			}
		}
		else
		{
			System.out.println("Given index does not exist");
		}
	}
	public void remove()
	{
		
	}

}

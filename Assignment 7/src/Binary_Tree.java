class Binary_Tree
{

    Node root;

    void addNode(int key, String name)
    {
        Node nodeToAdd = new Node(key, name);
        if (root == null)
        {
            root = nodeToAdd;
            System.out.println(nodeToAdd.name + " has been added to the Family Tree as the Root.");
            System.out.println();
        }
        else
            {
            Node nodeOfFocus = root;
            Node parent;
            while (true)
            {
                parent = nodeOfFocus;
                if (nodeToAdd.key < nodeOfFocus.key)
                {
                    nodeOfFocus = nodeOfFocus.leftChild;
                    if (nodeOfFocus == null)
                    {
                        parent.leftChild = nodeToAdd;
                        return;
                    }
                }
                else
                    {
                    nodeOfFocus = nodeOfFocus.rightChild;
                    if (nodeOfFocus == null)
                    {
                        parent.rightChild = nodeToAdd;
                        return;
                    }
                }
            }
        }
    }

    boolean deleteNode()
    {
        Node nodeOfFocus = root;
        Node parent = root;

        boolean isThisALeftChild = true;

        while (nodeOfFocus.key != 11)
        {
            parent = nodeOfFocus;
            if (11 < nodeOfFocus.key)
            {
                isThisALeftChild = true;
                nodeOfFocus = nodeOfFocus.leftChild;
            }
            else
                {
                isThisALeftChild = false;
                nodeOfFocus = nodeOfFocus.rightChild;
                }
            if (nodeOfFocus == null)
                return false;
            }
            if (nodeOfFocus.leftChild == null && nodeOfFocus.rightChild == null)
            {
            if (nodeOfFocus == root)
                root = null;
            else if (isThisALeftChild)
                parent.leftChild = null;
            else
                parent.rightChild = null;
            }
            else if (nodeOfFocus.rightChild == null)
            {
            if (nodeOfFocus == root)
                root = nodeOfFocus.leftChild;
            else if (isThisALeftChild)
                parent.leftChild = nodeOfFocus.leftChild;
            else
                parent.rightChild = nodeOfFocus.leftChild;
            }
            else if (nodeOfFocus.leftChild == null)
            {
            if (nodeOfFocus == root)
            {
                root = nodeOfFocus.rightChild;
            }
            else if (isThisALeftChild)
            {
                parent.leftChild = nodeOfFocus.rightChild;
            }
            else
                {
                parent.rightChild = nodeOfFocus.rightChild;
            }
            }
            else
            {
            Node replacementNode = getReplacementNode(nodeOfFocus);
            if (nodeOfFocus == root)
            {
                root = replacementNode;
            }
            else if (isThisALeftChild)
            {
                parent.leftChild = replacementNode;
            }
            else
                {
                parent.rightChild = replacementNode;
            }
            replacementNode.leftChild = nodeOfFocus.leftChild;
        }
        return true;
    }

    private Node getReplacementNode(Node replacementNode)
    {
        Node replacementParent = replacementNode;
        Node replacement = replacementNode;
        Node nodeOfFocus = replacementNode.rightChild;

        while (nodeOfFocus != null)
        {
            replacementParent = replacement;
            replacement = nodeOfFocus;
            nodeOfFocus = nodeOfFocus.leftChild;
        }

        if (replacement != replacementNode.rightChild)
        {
            replacementParent.leftChild = replacement.rightChild;
            replacement.rightChild = replacementNode.rightChild;
        }
        return replacement;
    }


     void inOrderTraversal(Node nodeOfFocus)
    {
        if (nodeOfFocus != null)
        {
            inOrderTraversal(nodeOfFocus.leftChild);
            System.out.println(nodeOfFocus);
            inOrderTraversal(nodeOfFocus.rightChild);
        }
    }

    Node findNode()
    {
        Node nodeOfFocus = root;

        while (nodeOfFocus.key != 11)
        {
            if (11 < nodeOfFocus.key)
            {
                nodeOfFocus = nodeOfFocus.leftChild;
            }
            else
                {
                nodeOfFocus = nodeOfFocus.rightChild;
            }
            if (nodeOfFocus == null)
                return null;
        }
        return nodeOfFocus;
    }
}

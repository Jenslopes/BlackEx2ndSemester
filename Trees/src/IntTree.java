// Simple binary tree class that includes methods to construct a tree of ints,
// to print the structure, and to print the data using a preorder, inorder or
// postorder traversal.  The trees built have nodes numbered starting with 1
// and numbered sequentially level by level with no gaps in the tree.  The
// documentation refers to these as "sequential trees."

public class IntTree {
    public IntTreeNode overallRoot;

    // post: constructs an empty tree
    public IntTree() {
        overallRoot = null;
    }

    // post: value is added to overall tree so as to preserve the
    //       binary search tree property
    public void add(int value) {
        overallRoot = add(overallRoot, value);
    }

    // post: value is added to given tree so as to preserve the
    //       binary search tree property
    private IntTreeNode add(IntTreeNode root, int value) {
        if (root == null) {
            root = new IntTreeNode(value);
        } else if (value <= root.data) {
            root.left = add(root.left, value);
        } else {
            root.right = add(root.right, value);
        }
        return root;
    }

    // post: returns true if overall tree contains value
    public boolean contains(int value) {
        return contains(overallRoot, value);
    }

    // post: returns true if given tree contains value
    private boolean contains(IntTreeNode root, int value) {
        if (root == null) {
            return false;
        } else if (root.data == value) {
            return true;
        } else if (value < root.data) {
            return contains(root.left, value);
        } else {
            return contains(root.right, value);
        }
    }

    // pre : max >= 0 (throws IllegalArgumentException if not)
    // post: constructs a sequential tree with given number of nodes
    public IntTree(int max) {
        if (max < 0) {
            throw new IllegalArgumentException("max: " + max);
        }
        overallRoot = buildTree(1, max);
    }

    // post: returns a sequential tree with n as its root unless n is greater
    //       than max, in which case it returns an empty tree
    private IntTreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            IntTreeNode left = buildTree(2 * n, max);
            IntTreeNode right = buildTree(2 * n + 1, max);
            return new IntTreeNode(n, left, right);
        }
    }


    private int countLeftNodes(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 0;
        } else if (root.left == null && root.right != null) {
            return 0;
        } else {
            return 1 + countLeftNodes(root.left) + countLeftNodes(root.right);
        }
    }

    public int countLeftNodes() {
        return countLeftNodes(overallRoot);
    }

    private int countEmpty(IntTreeNode root) {
        if (root == null) {
            return 1;
        } else {
            return countEmpty(root.left) + countEmpty(root.right);
        }
    }

    public int countEmpty() {
        return countEmpty(overallRoot);
    }

    private int depthSum(IntTreeNode root, int level) {
        if (root == null) {
            return 0;
        } else {
            return level * root.data + depthSum(root.left, level + 1) + depthSum(root.right, level + 1);
        }
    }

    public int depthSum() {
        return depthSum(overallRoot, 1);
    }

    private int countEvenBranches(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.data % 2 == 1 || root.left == null && root.right == null) {
            return countEvenBranches(root.left) + countEvenBranches(root.right);
        } else {
            return 1 + countEvenBranches(root.left) + countEvenBranches(root.right);
        }
    }

    public int countEvenBranches() {
        return countEvenBranches(overallRoot);
    }

    private void printLevel(IntTreeNode root, int level) {
        if (level < 1) {
            throw new IllegalArgumentException();
        }
        if (root == null) return;

        if (level == 1) {
            System.out.println(root.data);
        } else {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }

    public void printLeaves() {
        printLeaves(overallRoot);
    }

    private void printLeaves(IntTreeNode root) {
        if (overallRoot == null) {
            System.out.println("There is none");
        }
        if (root == null) {
            return;
        }
        printLeaves(root.right);
        printLeaves(root.left);
        if (root.left == null && root.right == null) {
            System.out.println(root.data);
        }
    }


    public void printLevel(int n) {
        printLevel(overallRoot, n);
    }

    // post: prints the tree contents using a preorder traversal
    public void printPreorder() {
        System.out.print("preorder:");
        printPreorder(overallRoot);
        System.out.println();
    }

    // post: prints in preorder the tree with given root
    private void printPreorder(IntTreeNode root) {
        if (root != null) {
            System.out.print(" " + root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }


    // post: prints in inorder the tree with given root
    private void printInorder(IntTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(" " + root.data);
            printInorder(root.right);
        }
    }

    // post: prints the tree contents using an inorder traversal
    public void printInorder() {
        System.out.print("inorder:");
        printInorder(overallRoot);
        System.out.println();
    }


    // post: prints the tree contents using a postorder traversal
    public void printPostorder() {
        System.out.print("postorder:");
        printPostorder(overallRoot);
        System.out.println();
    }

    // post: prints in postorder the tree with given root
    private void printPostorder(IntTreeNode root) {
        if (root != null) {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(" " + root.data);
        }
    }

    // post: prints the tree contents, one per line, following an inorder
    //       traversal and using indentation to indicate node depth; prints
    //       right to left so that it looks correct when the output is rotated.
    public void printSideways() {
        printSideways(overallRoot, 0);
    }

    // post: prints in reversed preorder the tree with given root, indenting
    //       each line to the given level
    private void printSideways(IntTreeNode root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }
}
class GameOfTwoStacks {

  int data[];
  public static final int DEFAULT_SIZE = 10;
  int ptr = 0;

  int checkSum = 100;

  public GameOfTwoStacks(int size) {
    data = new int[size];
  }

  public GameOfTwoStacks() {
    data = new int[DEFAULT_SIZE];
  }

  public void push(int value) {
    data[ptr] = value;
    ptr++;
  }

  public int pop() {
    if (ptr == 0) {
      System.out.println("Stack is empty. Can't pop element from the stack.");
      return -1;
    }
    ptr--;
    return data[ptr];
  }

  public void display() {
    for (int i = 0; i < ptr; i++) {
      System.out.print(data[i] + " ");
    }
    System.out.println();
  }

  public void finalAns(GameOfTwoStacks stack1, GameOfTwoStacks stack2, GameOfTwoStacks finalStack) {
    int sumSoFar = 0;
    if(stack1.data[stack1.ptr - 1] < stack2.data[stack2.ptr - 1]) {
      finalStack.push(stack1.pop());
      sumSoFar += finalStack.data[finalStack.ptr - 1];
    }
    else if(stack1.data[stack1.ptr - 1] > stack2.data[stack2.ptr - 1]) {
      finalStack.push(stack2.pop());
      sumSoFar += finalStack.data[finalStack.ptr - 1];
    }
    else {
      finalStack.push(stack1.pop());
    }
  }

  public static void main(String[] args) {
    GameOfTwoStacks stack1 = new GameOfTwoStacks();
    GameOfTwoStacks stack2 = new GameOfTwoStacks();
    GameOfTwoStacks finalStack = new GameOfTwoStacks();
    stack1.push(10);
    stack1.push(20);
    stack1.push(30);
    stack1.display();
    stack2.push(40);
    stack2.push(50);
    stack2.push(60);
    stack2.display();
    stack1.pop();
    stack1.display();
    stack2.pop();
    stack2.display();
  }
}
class MinStack {
    private Stack<int[]> st;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push(new int[]{val, val});
        } else {
            int currentMin = st.peek()[1];
            st.push(new int[]{val, Math.min(val, currentMin)});
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
        }
    }

    public int top() {
        if (!st.isEmpty()) {
            return st.peek()[0];
        }
        return -1; // or throw exception
    }

    public int getMin() {
        if (!st.isEmpty()) {
            return st.peek()[1];
        }
        return -1; // or throw exception
    }
}

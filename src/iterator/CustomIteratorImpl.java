package iterator;

import java.util.List;

public class CustomIteratorImpl implements CustomIterator<User>{

    private final List<User> users;

    private int currentIndex = 0;

    public CustomIteratorImpl(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < users.size();
    }

    @Override
    public User next() {
        return users.get(currentIndex++);
    }
}

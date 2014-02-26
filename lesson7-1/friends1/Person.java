// BlueJ project: lesson7/friends1

import java.util.ArrayList;

// This is part of the Person class from lesson 3.
// A String is not the right way to store the friends of a Person
// We need to refactor this code.
// Change the friends variable to store an ArrayList<String>
// that contains the names of the friends.
// Re-implement the addFriend and getFriends methods.
public class Person
{
    private String name;
    ArrayList<String> friends;
    private static final String SEPARATOR = ", ";

    public Person(String name)
    {
        this.name = name;
        friends = new ArrayList<String>();
    }

    /**
     * Adds the given friend to this Person's friends list.
     * @param friend the friend to add.
     */
    public void addFriend(Person friend)
    {
        friends.add(friend.name);
    }

    /**
     * Gets a list of all of this Person's friends.
     * @return the names of the friends separated by a comma and a space.
     *     e.g. "Sara, Cheng-Han, Cay"
     */
    public String getFriends()
    {
        String friendList = "";
        int x = 0;
        for (String friend : friends) {
            if (x == friends.size() - 1) {
                friendList = friendList + friend;
            } else {
                friendList = friendList + friend + SEPARATOR;
            }
            x++;
        }
        return friendList;
    }

    /**
     * Gets a friend at a given index.
     * @param friendIndex the index at which to find the friend (starting at 0)
     * @return the name of the friend at friendIndex, or "" if the friend is not present
     */
    public String getFriend(int friendIndex)
    {
        if (friendIndex < friends.size() && friendIndex >= 0) {
            return friends.get(friendIndex);
        } else {
            return "";
        }
    }
}

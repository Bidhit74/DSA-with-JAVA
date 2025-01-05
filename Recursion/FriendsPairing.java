// Problem 13 :- Friends Pairing Problem  (Ask in Goldman Sachs)
// Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.

public class FriendsPairing {

    /* 
    public static int friendsPairing(int n) {
        // Base case: If there's only 1 or 2 friends, the number of ways is equal to n
        if (n == 1 || n == 2)
            return n;

        // Recursive case:
        // Choice 1: Treat the current friend as single
        int singleFriends = friendsPairing(n - 1);

        // Choice 2: Pair the current friend with any of the (n-1) other friends
        int pairedFriends = friendsPairing(n - 2); // Recursive call for the remaining friends
        int pairedWays = (n - 1) * pairedFriends; // Multiply by (n-1) possible pairings

        // Total ways: Sum of single and paired choices
        int totalWays = singleFriends + pairedWays;

        // Return the total number of ways to pair up n friends
        return totalWays;
    }
    */
    // short code
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2)
            return n;
        return friendsPairing(n-1) + friendsPairing(n-2) * (n-1);
    }
    public static void main(String[] args) {
        int friends = 6;
        System.out.println(friendsPairing(friends));
    }
}

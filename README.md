# Twitter-like-website-with-MVC-software-architecture
This project contains all the requirements mentioned in the project file. In addition, it has several parts that I will explain.</br>
## Controllers:
I only used one controller file to the right all the needed functionalities in this part. HomeController.scala contains all the functions for redirection between the HTML pages and the functionalities such as like, follow, search, comment, and ... </br>

## Models: 
User and post are two scala files in this folder. Users contain the username, password, and a list of usernames as friends. User also includes some functions:</br>
1. findallUsers: gives us a list of all users with their information.
2. createUser: we give this function some information from the controller,
and it creates a new user based on that information.
3. Remove user: it receives a user from the controller file and deletes it from
the users.
</br>
The other file in this folder is posted. Post contains a case class of posts. Each post has an id, username, date, text, comments (includes the id of posts that are comments of this post), likes (number of likes), share(number of shares), hashtag, commentOrNot( is this post comment or post because comments don't have a share, and comment ability), and img that contains the potential image the user wants to share.</br></br>
Post also contains some functions:
1. findAllSortedByDate
2. findAllSortedByLikes
3. findNotComments: posts sorted by date
4. findNotComments2: posts sorted by Like
5. findComments: comments sorted by date
6. findComments2: comments sorted by Like
7. createPost
8. RemovePost
Comments and posts are the same, and the difference is in the controller part and the different functions.</br>

## Views:
contains the HTML files. I tried to make it as similar to your template, as much as possible.</br>

## Functions in the controller:
1. login: The index.html file in my project is the signup and login page. So
access to the other pages needs a username or password. There is also widespread use of sessions in this project to prevent that—this function, Leeds the index file.
2. home: This function loads the project's home page that contains all the posts, the header with the buttons, and the search bar. I couldn't find a way in HTML to change the sorting of the posts, but the scala code is available in the models.
3. validateComment: redirect to a page for adding a comment. Comments don't have images.
4. comments: We have a different HTML page for the comments of each post. The structure is precisely the same as the home page, but we have the post's comments in it. We used the sessions for having the post's id and an argument in the function for passing the username of the person who is commenting.
5. validateLike: This function only redirect to the like function in the HomeController.scala
6. Like: like, will redirect to the homepage and add to the number of likes of that post. It also receives postID as an argument.
7. goTosharingPage: This function only redirects to the Newport page for adding a post.
8. createPost: adds one post to the post based on the received information. It also gets the text, the hashtag, and the image. The other factors are empty because a new post cant have likes and comments at first.
9. removePost: it receives the postID and deletes that post.
10. goTosharingPageComment: this function only redirect to the
Newcomment html file
11. createComment: the structure of this function is similar to creatPost
function.
12. Share: This function creates a new post with the user name and the post's
data. And also, there will be a text added to the original text that says
Shared from @username.
13. validateLogin: checks if the username and password are correct and valid.
14. createUser: checks the username and creates a user if the username
doesn't exist in the database.
15. logout: delete the old session and redirect to the login and signup page.
16. Profile: redirect to tweetsOfUsersOrHashtags HTML file and shows the
users' posts or posts with the hashtag. You can test this with the search
bar.
17. MyProfile: It shows the users' posts and a different search bar for
following other users. They can see their followed user's posts in the explore.
18. Follow: adds the username of that user to the list of followed users. 19. Explore: loads the explore page that shows the people's posts, user
followed.

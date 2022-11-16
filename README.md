# Novel-Characters
CODING CHALLENGE REQUIREMENTS
Novel Characters

----------RULES---------------

You’re able to work alongside your peers, use the internet, any notes you’ve taken, and even any contents I have provided you during training. HOWEVER, you may NOT take code from your peers (or give code to a peer).

You’re able to ask me questions if you get stuck. I DO NOT MIND helping with particularly nasty configuration issues, bugs, and exceptions. If there is already an example in our git repository I may direct you to those examples. And if I decide that I have provided a little too much help OR the issue is a little too basic THEN I reserve the right to tell you to “figure it out”.

But please, ask me questions. If you don’t know if a question is basic or not then simply ask; what’s the worst that can happen? I’m not going to transform into a werewolf, release a horrific howl, then vanish into the night as if I was never there to begin with.

----------OVERVIEW---------------

Total Points: 100

Choose any technologies from your specific curriculum.

Project Description:
You’ll be building an application that can help you keep track of fictional characters for upcoming novels. You’ll be able to add new characters, update characters, see all existing characters, and delete characters.


----------Convention Requirements---------------

Your code should follow reasonable conventions, like: file/object/class/etc naming conventions, file/folder/package naming, etc. Your code shouldn’t be throwing warnings/errors. AND most of your code should be self-documenting.

----------Minimum Viable Product---------------------

First, there is no login required. Imagine the system entirely open to the public.

*database*
Create a NOVEL table and FICTIONAL_CHARACTER table
You can put whatever fields you’d like in the tables but put at LEAST 3 fields in the NOVEL table and at least 5 fields in the FICTIONAL_CHARACTER table, please.
These two tables have a one-to-many relationship.

*novel*
As a user, I can view all novels that currently exist.
As a user, I can create a new novel, by entering my own custom information.
As a user, I can click on a specific novel to see all fictional characters that exist in that specific novel.
This should be on a separate HTML page.
A single novel cannot have more than 3 characters in it. The user should be given feedback when their character is rejected.

*fictional character*
As a user, I can view ALL fictional characters that currently exist; not just all fictional characters in a given novel.
As a user, I can view information about a specific fictional character to learn more about that character.
As a user, I can create a new fictional character, by entering my own custom information.
Again, a single novel cannot have more than 3 characters in it. The user should be given feedback when their character is rejected.
As a user, I can update the details of an existing character. For example, the name of this specific character.
As a user, I can remove/delete characters.
As a user, I can filter characters so that I can find a specific character I want to see.

*meta requirements*

Styled
Front Controller Design Pattern
Dao Design Pattern


*read advice below*

-----------Finally-------------------------

Fully review your project code, and be able to explain it.


>>>>>>>>>>POINTS>>>>>>>>>>

I will award full points to each userstory/functionality that has a FULL connection from the front end through the server to the database and vice versa.
Partial credit if you can at LEAST show me the endpoints working in postman; meaning that you at LEAST have server API functionality. Roughly 60% credit, give or take a few percent.
Partial credit if you can at LEAST show me the functionality working in a non-server main method. Roughly 0-30%, depending on what is demonstrated.
No credit will be awarded for simply writing broken code.


NOVEL
Create, 10 points
Read all, 10 points
Read single w/ characters, 10 points
Character limit, 15 points

FICTIONAL CHARACTER
Create, 10 points
Read all, 5 points
Update, 10 points
Delete, 10 points
Filter, 10 points

STYLING
When you order something at a restaurant the food needs to taste good AND look presentable; your application is no different. Make it look presentable and styled. 10 points.


-----------ADVICE-------------------------

I HIGHLY HIGHLY HIGHLY RECOMMEND THAT YOU STAY FOCUSED AND TRY TO COMPLETE ONE TASK AT A TIME!!!

YOU NEED TO DEMONSTRATE AS MUCH FUNCTIONALITY AS YOU CAN. So I highly recommend you work on the endpoints alongside their respective UI components; the reason I recommend this is so that if you run short on time at least you’ll have SOME full stack functionality to demonstrate. (as opposed to finishing all the endpoints BUT not have any UI to demo)

IF THE ONLY THING YOU CAN SHOW ME IS THE POSTMAN ENDPOINTS FUNCTIONING THAT IS STILL SOMETHING TO DEMONSTRATE. SHOW ME AS MUCH AS YOU CAN.

# DVD-rentals

User should be able to retrieve available DVDs from the store


    Users will provide the name/title of the film they want to rent. 
         -Should be able to get a film by ID
         -find the inventory id using the film name
         -Should be able to get all films.
         -Should response film with all details
         -If there is no film found, simply return 404 NOT FOUND
    The search should be case insensitive but not partial search
    Verify the customer exists in the DB otherwise create a customer
    Verify the films are available to rent out.
        -You can query the inventory table to find out the available count of the film
        -You can then query the rental table where the return dates are null to make sure the inventory is available for rent
        -If it's available insert a new record in the rental table
        -insert the payment details in the payment table
        -When the movie is not found or not available for renting, reply with a proper message
    Able to check out one DVD endpoint
    Able to check out multiple DVDs endpoints
    Should deduct out DVDs from the inventory


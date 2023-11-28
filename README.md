Classes and Structure:
1. Item Super Class:
Data Members:

ID (int): The item ID.
title (String): The item title.
author (Author): The author of the book.
price (double): The price of the book.
pages (int): The number of book pages.
dueDays (int): Days by which the book is due for return.
publishingDate (LocalDate): The date of publishing.
Methods:

Required constructors, getters, setters, and toString() method.
2. Book Sub Class:
Additional Data Members:

ISBN (String): The International Standard Book Number uniquely identifies the book.
genre (String): The genre or category of the book.
description (String): A brief description or summary of the book.
Methods:

Required constructors, getters, setters, and toString() method.
3. Scientific Journals Sub Class:
Additional Data Members:

publicationFrequency (String): Represents how often the scientific journal is published (e.g., monthly, quarterly).
impactFactor (double): The impact factor of the scientific journal, indicating its average number of citations.
Methods:

Required constructors, getters, setters, and toString() method.
4. Magazines Sub Class:
Additional Data Members:

issueNumber (int): Represents the issue number of the magazine.
Methods:

Required constructors, getters, setters, and toString() method.
5. NewsPapers Sub Class:
Additional Data Members:

issueLanguage (String): The publication language of the newspaper.
Methods:

Required constructors, getters, setters, and toString() method.

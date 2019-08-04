# MVP_Project

/* --------------------------------HOW MVP WORKS HERE-----------------------------------------
 *
 * MODEL :
 * is where your business logic and application data is stored.
 * In Android, the role of a model is usually played by a data access layer
 * such as database API or REST API.
 *
 * VIEW :
 * View is basically a passive interface cum UI which is
 * responsible for routing user’s action to the presenter.
 * In Android, View can be your Activity, fragment or RecyclerView Adapters.
 * In general, View is not visible to your Model except
 * for the POJOS and entities of your application.
 * To put in more simpler terms, Views do not communicate directly to Models.
 * However, they talk to presenters.
 *
 PRESENTER :
 *  0. In MVP the presenter assumes the functionality of the "middle-man".
 * All presentation logic is pushed to the presenter.
 * 1. Listens to user action and model updates
 * 2. Updates model and view
 * 3. Presenter is the middleman or mediator between View and Model
 * which hold responsibilities of everything which has to deal
 * with presentation logic in your application.
 * In general terms, Presenter does the job of
 * querying your Model, updating the View while responding to the user’s interactions.
 * It monitors Model and talks to View so that
 * they can handle when a particular View needs to be updated and when to not.
 *
 * */

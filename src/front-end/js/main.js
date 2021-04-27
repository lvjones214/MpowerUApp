import{
    displayHeader
}from "./header"

const mainPageDisplay = function(){

    const appBackground = document.createElement("div");
    appBackground.classList.add("app-background");
    const description =document.createElement("p");
    description.classList.add("description");
    description.innerText="Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquid praesentium, temporibus quam soluta repellat illum nesciunt repudiandae aperiam dignissimos quibusdam officiis deserunt doloribus optio numquam, ipsum eos quo placeat reprehenderit."
    const createButton = document.createElement("div");
    createButton.classList.add("buttons");
    const buttonLink = document.createElement("a");
    buttonLink.classList.add("show-all");
    buttonLink.innerText= "Show All Resources";
    buttonLink.addEventListener('click', (clickEvent)=>{
        clickEvent.preventDefault();
        const allCategoriesView = document.querySelector(".show-all");
        fetch ("http://localhost:8080/api/categories")
            .then(response=> response.json())
            .then(categories => displayAllCategoriesView(categories))
            .then(allCategoriesView=> mainPageDisplay.replaceWith(allCategoriesView))
            .catch(error=> console.log(error));
    });
    appBackground.prepend(displayHeader);
    appBackground.appendChild(description);
    appBackground.appendChild(button);

    return mainPageDisplay;
}



const displayHeader = function(){
    const div = document.createElement("div");
    div.classList.add("logo");
    const image = document.createElement("img");
    image.classList.add("logoImage");
    image.setAttribute("src", "/src/front-end/img/logo2.png");
    div.appendChild(image);

return div;
}

export{
    displayHeader
}





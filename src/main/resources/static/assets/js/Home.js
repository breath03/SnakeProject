// const roomPictureEls = [...document.querySelectorAll('section.why-us .roomPicture')]
//
// for (i = 0; i < roomPictureEls.length; i++) {
//     roomPictureEls[i].addEventListener('click', function() {
//         console.log('간다!')
//     });
// }

const roomPictures = [];

for (i = 0; i <= 4; i++) {
    const el = document.querySelector('section.why-us .roomPicture' + i);
    if(el) {
        roomPictures.push(el);
    }
}

roomPictures.forEach(function(roomPicture) {
    roomPicture.addEventListener('click', function() {
        console.log(this.className);
    })
})

const seatButtonEl = document.querySelector('section.why-us .container .buttonGroup .seatButton');
const roomButtonEl = document.querySelector('section.why-us .container .buttonGroup .roomButton');
const roomsEl = document.querySelector('section.why-us .container .rooms');
const seatEl = document.querySelector('section.why-us .container .seats');



roomButtonEl.addEventListener('click', function() {
    seatButtonEl.classList.remove('active')
    roomButtonEl.classList.add('active')

    roomsEl.style.display = "block";
    seatEl.style.display = "none";

    // seatEl.classList.add('disappear')
    // roomsEl.classList.remove('disappear')
})

seatButtonEl.addEventListener('click', function() {
    roomButtonEl.classList.remove('active')
    seatButtonEl.classList.add('active')

    seatEl.style.display = "block";
    roomsEl.style.display = "none";

    // roomsEl.classList.add('disappear')
    // seatEl.classList.remove('disappear')
})

const count1 = document.getElementsByClassName("seat").length;
const count2 = document.getElementsByClassName("selectedSeat").length;
const count3 = count1 - count2;

window.addEventListener('DOMContentLoaded', function()
{
    // seatEl.classList.add('disappear')
    seatEl.style.display = "none";

    $("#totalcount").text(count1);
    $("#usecount").text(count2);
    $("#leftcount").text(count3);

    $('.selectedSeat').css('background-color', '#6feaf6');


});

// window.onload = function() {
//
//
// }

const 개인좌석El = document.querySelector(개인좌석Elcss값);
const 개인좌석Els = document.querySelectorAll(개인좌석Elcss값);
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

seatButtonEl.addEventListener('click', function() {
    roomButtonEl.classList.remove('active')
    seatButtonEl.classList.add('active')
    roomsEl.classList.add('disappear')
})
roomButtonEl.addEventListener('click', function() {
    seatButtonEl.classList.remove('active')
    roomButtonEl.classList.add('active')
    roomsEl.classList.remove('disappear')
})
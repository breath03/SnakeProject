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
    roomsEl.style.display = "none";

    $("#totalcount").text(count1);
    $("#usecount").text(count2);
    $("#leftcount").text(count3);

    $('.selectedSeat').css('background-color', '#6feaf6');


});

// window.onload = function() {
//
//
// }

const seatEls = document.querySelectorAll('section.why-us .container .seatContainer .seat');
const myModal = document.getElementById('exampleModal')
const myModal2 = document.getElementById('exampleModal2')
const myInput = document.getElementById('exampleModalLabel')
const myInput2 = document.getElementById('exampleModalLabel2')
const ModalContent = document.getElementById('modal-body')
const ModalContent2 = document.getElementById('modal-body2')
// const modalSuccessButton = document.querySelector('section.why-us .container .modal-footer button.btn-primary')
const modalSuccessButton = document.getElementById('modalsucbtn')
const modal2Button = document.getElementById('modal2Button')

let selectId

seatEls.forEach(function(seatEl) {
    seatEl.addEventListener('click', function () {
        selectId = seatEl.id
        ModalContent.innerHTML = seatEl.id.substring(4) + "번 자리로 하시겠습니까?"
    })
})

modalSuccessButton.addEventListener('click', function() {
    const selectSeatEl = document.getElementById(`${selectId}`)
    console.log(selectSeatEl.classList.contains('selectedSeat'))

    if(selectSeatEl.classList.contains('selectedSeat')) {
        ModalContent2.innerHTML = "해당 자리는 이미 선택된 자리입니다. 다른자리를 선택해 주세요."
    }else if(!selectSeatEl.classList.contains('selectedSeat') && selectSeatEl.classList.contains('seat')) {
        ModalContent2.innerHTML = "자리배치가 완료되었습니다."
    }else {
        ModalContent2.innerHTML = "오류가 발생했습니다. 다시 시도해주세요."
    }
})

modal2Button.addEventListener('click', function () {
    window.location.reload()
})

let courseList = []
const courseListEl = document.querySelector('.course-list');

let params = {
    type : null,
    name : null,
    topic : null
}

const getAllCourseApi = () => {
    return axios.get("http://localhost:8080/api/v1/courses" , { params })
}
const getAllCourse = async (params) => {
    try {
        let res = await getAllCourseApi(params);
        courseList = res.data;
        renderCourse(courseList);
    } catch (error) {
        console.log(error);
    }
}

const renderCourse = (courseList) => {
    let html = "";
    courseList.forEach(course => {
        html += `
                <div class="col-md-4">
                <a href="./detail.html?id=${course.id}">
                    <div class="course-item shadow-sm rounded mb-4">
                        <div class="course-item-image">
                            <img src="${course.thumbnail}"
                                alt="khoa hoc">
                        </div>
                        <div class="course-item-info p-3">
                            <h2 class="fs-5 mb-3 text-dark">${course.name}</h2>
                            <p class="type fw-light text-black-50">${course.type}</p>
                        </div>
                    </div>
                </a>
                </div>
            `
    });
    courseListEl.innerHTML = html;
}
getAllCourse(params);
let topicList = []
const getAllTopic = async () => {
    try {
        let res = await axios.get("http://localhost:8080/api/v1/topics");
        topicList = res.data;
        renderTopic(topicList);
    } catch (error) {
        console.log(error);
    }
}
const topicListEl = document.querySelector('.topic-list');
const renderTopic = (topicList) => {
    let html = `<h2 class="fs-5 mb-4">Chủ đề</h2>`;
    topicList.forEach(topic => {
        html += `
        <div class="topic-item input-group d-flex align-items-center mb-1">
            <input type="radio" value="${topic}" id="${topic}" name="topic" class="check">
            <label for="${topic}" class="ms-2 fs-5">${topic}</label>
        </div>
        `
    });
    topicListEl.innerHTML = html;
    let inputRadioEl = document.querySelectorAll('.check');
    inputRadioEl.forEach(e => {
        e.addEventListener('click', function(){
            params.topic = e.value;
            getAllCourse(params);
        })
    })
}

getAllTopic();

const searchInputEl = document.querySelector('.seach-form-input');
searchInputEl.addEventListener("keydown" , function(event){
    if(event.keyCode == 13){
        let val = searchInputEl.value;
        params.name = val;
        getAllCourse(params);
    }
})


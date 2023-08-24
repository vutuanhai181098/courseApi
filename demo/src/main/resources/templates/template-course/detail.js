const url = new URL(window.location.href);
const id = url.searchParams.get("id");


let course;
const getCourse = async () => {
    try {
        let res = await axios.get(`http://localhost:8080/api/v1/courses/${id}`)
        course = res.data;
        renderCourse(course);
    } catch (error) {
        console.log(error);
    }
}

const title = document.querySelector('.active');
const courseTitle = document.querySelector('.course-title')
const supporter = document.querySelector('.supporter')
const courseDescription = document.querySelector('.course-description')
const renderCourse = (course) => {
    title.textContent= `${course.name}`;
    courseTitle.textContent = `${course.name}`;
    supporter.innerHTML = `
            <div class="supporter-image">
                <img src="${course.userDto.avatar}" alt="tư vấn viên" class="rounded-circle h-75">
            </div>
            <div class="supporter-info">
                <p>
                    <b>Tư vấn viên :</b>
                    ${course.userDto.name}
                </p>
                <p>
                    <b>Email :</b>
                    ${course.userDto.email}
                </p>
                <p>
                    <b>Số điện thoại :</b>
                    ${course.userDto.phone}
                </p>
            </div>
    `

    courseDescription.innerHTML = `<p>${course.description}</p>`
}
getCourse();
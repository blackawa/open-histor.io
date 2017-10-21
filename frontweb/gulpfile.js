const gulp = require("gulp");
const sass = require("gulp-sass");
const watch = require("gulp-watch");
const plumber = require('gulp-plumber');

const variables = {
    src: {
        scss: 'src/main/scss/*.{scss,css}'
    },
    dest: {
        stylesheets: 'src/main/resources/static/stylesheets'
    }
};

gulp.task("sass:build", () => gulp.src(variables.src.scss)
    .pipe(sass())
    .pipe(gulp.dest(variables.dest.stylesheets)));

gulp.task("sass:watch", () => gulp.src(variables.src.scss)
    .pipe(watch(variables.src.scss))
    .pipe(plumber())
    .pipe(sass())
    .pipe(gulp.dest(variables.dest.stylesheets)));

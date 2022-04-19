const output = config.output
const devServer = config.devServer

Object.assign(output, {
    publicPath: '/',
});

if (devServer && devServer !== null) {
    Object.assign(devServer, {
        historyApiFallback: {
            rewrites: [{ from: /\//, to: '/404.html' }],
        },
    });
}

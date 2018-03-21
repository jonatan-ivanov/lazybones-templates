def props = [:]
props.appName = ask("Define value for 'appName' [nanoservice]: ", 'nanoservice', 'appName')

processTemplates 'Dockerfile', props
processTemplates 'docker-compose.yml', props
processTemplates 'README.md', props

import RootState from './rootState';
import SystemConstants from '../../../common/constants/systemConstants';
import ConnectionStatus from '../../../common/stream/models/connectionStatus';
import TranslationConstants from '../../../common/constants/translationConstants';
import i18nService from '../../../common/service/i18nServiceImpl';

let initialState: RootState = {
    chats: [{
        sender: SystemConstants.SystemUser,
        message: i18nService.Instance.translate(TranslationConstants.welcomeToTheGame),
        received: Date.now()
    }],
    connection: {
        connectionStatus: ConnectionStatus.Connecting,
        userId: ''
    },
    room: null,
    player: null
};
export default initialState;